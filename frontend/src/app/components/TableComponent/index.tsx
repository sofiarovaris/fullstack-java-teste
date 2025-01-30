'use client';

import type { TravelRequestType } from '@/app/types/travelRequestType';
import { Table, TableColumnsType, TableProps, type TablePaginationConfig } from 'antd';
import React, { useState } from 'react';
import LoadingIndicator from '../LoadingIndicator';
import type { FilterValue, SorterResult, TableCurrentDataSource } from 'antd/es/table/interface';
import dayjs from 'dayjs';
import 'dayjs/locale/pt-br';

const formatDate = (dateString?: string) => {
  if (!dateString) return '-';
  return dayjs(dateString).locale('pt-br').format('DD/MM/YYYY HH:mm');
};

const columns: TableColumnsType<TravelRequestType> = [
  {
    title: 'ID da Solicitação',
    dataIndex: 'requestId',
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
    render: (_, record) => formatDate(record.departureTime), // Garante que vem do objeto correto
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
const TableComponent: React.FC<TableComponentProps> = ({ page, pageSize, loading, data }) => {
  const [pagination, setPagination] = useState({
    current: page,
    pageSize,
    total: data.length,
  });

  function onChange(
    pagination: TablePaginationConfig,
    filters: Record<string, FilterValue | null>,
    sorter: SorterResult<TravelRequestType> | SorterResult<TravelRequestType>[],
    extra: TableCurrentDataSource<TravelRequestType>
  ) {
    setPagination({
      current: pagination.current || 1,
      pageSize: pagination.pageSize || 5,
      total: pagination.total || data.length,
    });
  }

  return (
    <div>
      {loading ? (
        <LoadingIndicator />
      ) : (
        <Table<TravelRequestType>
          columns={columns}
          dataSource={data}
          pagination={pagination}
          onChange={onChange}
        />
      )}
    </div>
  );
};

export default TableComponent;
