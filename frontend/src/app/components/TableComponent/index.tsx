import type { TravelRequestType } from '@/app/types/travelRequestType';
import { Table, TableColumnsType, type TablePaginationConfig } from 'antd';
import dayjs from 'dayjs';
import 'dayjs/locale/pt-br';
import React, { useState } from 'react';
import LoadingIndicator from '../LoadingIndicator';

const formatDate = (dateString?: string) => {
  if (!dateString) return '-';
  return dayjs(dateString).locale('pt-br').format('DD/MM/YYYY HH:mm');
};

const columns: TableColumnsType<TravelRequestType> = [
  {
    title: 'ID da Solicitação',
    dataIndex: 'requestId',
    key: 'requestId',
  },
  {
    title: 'Nome do Passageiro',
    dataIndex: 'passengerName',
    sorter: (a, b) => a.passengerName.localeCompare(b.passengerName),
  },
  {
    title: 'Companhia Aérea',
    dataIndex: 'airline',
    sorter: (a, b) => a.airline.localeCompare(b.airline),
  },
  {
    title: 'Cidade de Origem',
    dataIndex: 'originCity',
    sorter: (a, b) => a.originCity.localeCompare(b.originCity),
  },
  {
    title: 'Cidade de Destino',
    dataIndex: 'destinationCity',
    sorter: (a, b) => a.destinationCity.localeCompare(b.destinationCity),
  },
  {
    title: 'Data de Partida',
    dataIndex: 'departureTime',
    sorter: (a, b) => a.departureTime.localeCompare(b.departureTime),
    render: (_, record) => formatDate(record.departureTime),
  },
  {
    title: 'Data de Chegada',
    dataIndex: 'arrivalTime',
    sorter: (a, b) => a.arrivalTime.localeCompare(b.arrivalTime),
    render: (_, record) => formatDate(record.arrivalTime),
  },
];

interface TableComponentProps {
  page: number;
  pageSize: number;
  loading: boolean;
  data: TravelRequestType[];
  total: number;
  setPage: React.Dispatch<React.SetStateAction<number>>;  // Função para setar o número da página
}

/**
 * TableComponent displays a table of travel requests with paginated data and sortable columns.
 * 
 * @param {number} page - The current page number for pagination.
 * @param {number} pageSize - The number of records per page for pagination.
 * @param {boolean} loading - A flag that indicates whether the table is in a loading state.
 * @param {TravelRequestType[]} data - The data to be displayed in the table, representing travel requests.
 * 
 * @returns {JSX.Element} A table component displaying the travel request data with pagination and sorting capabilities.
 */
const TableComponent: React.FC<TableComponentProps> = ({ page, pageSize, loading, data, total, setPage }) => {
  const [pagination, setPagination] = useState({
    current: page,
    pageSize,
    total,
  });

  function onChange(pagination: TablePaginationConfig) {
    setPagination({
      current: pagination.current || 1,
      pageSize: pagination.pageSize || 5,
      total: pagination.total || total,
    });
    setPage(pagination.current || 1);
  }

  const dataWithKeys = data.map((item, index) => ({
    ...item,
    key: `${index}-${item.requestId}`,
  }));

  return (
    <div>
      {loading ? (
        <LoadingIndicator />
      ) : (
        <Table<TravelRequestType>
          columns={columns}
          dataSource={dataWithKeys}
          pagination={pagination}
          onChange={onChange}
          rowKey="key"
        />
      )}
    </div>
  );
};

export default TableComponent;
