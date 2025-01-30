'use client';

import TableComponent from '@/app/components/TableComponent';
import { fetchTravelRequests } from '@/app/services/travelRequestApi';
import type { TravelRequestType } from '@/app/types/travelRequestType';
import { Button, Card, Typography } from 'antd';
import { useState } from 'react';

const { Title, Text, Paragraph } = Typography;

/**
 * TravelRequestsView component displays a view where users can search for
 * travel requests made in the last three months.
 * 
 * It includes a title, description, and a table displaying the travel requests,
 * with the ability to fetch data from an API and paginate the results.
 *
 * @component
 */
function TravelRequestsView() {
  const [loading, setLoading] = useState<boolean>(false);
  const [data, setData] = useState<TravelRequestType[]>([]);
  const [page] = useState<number>(1);
  const [pageSize] = useState<number>(5);

  /**
   * Asynchronously loads the travel requests data from the API and sets the state.
   * This function is called when the user clicks the 'Buscar' button.
   * It also manages the loading state to show the loading spinner during data fetch.
   */
  async function loadData () {
    setLoading(true);
    const response = await fetchTravelRequests();
    setData(response.data);
    setLoading(false);
  };

  return (
    <div
      style={{
        display: 'flex',
        justifyContent: 'center',
        alignItems: 'center',
        height: '100vh',
        backgroundColor: '#f0f2f5',
        padding: '20px',
      }}
    >
      <Card
        bordered={false}
        style={{
          width: '80%',
          maxWidth: '1000px',
          height: '700px',
          minHeight: '700px',
          padding: '20px',
          borderRadius: '10px',
          boxShadow: '0 4px 12px rgba(0, 0, 0, 0.1)',
          backgroundColor: 'white',
        }}
        title={
          <div
            style={{
              display: 'flex',
              justifyContent: 'space-between',
              alignItems: 'center',
              width: '100%',
            }}
          >
            <Title level={3} style={{ margin: 0 }}>
              Desafio Lemontech - Pesquisar solicitações de viagens
            </Title>
            <Button type="primary" onClick={loadData} >
              Buscar
            </Button>
          </div>
        }
      >
        <Paragraph
          style={{
            marginBottom: '20px',
            color: '#555',
            fontSize: '16px',
          }}
        >
          Solicitações de viagens realizadas nos últimos três meses. Os dados estão{' '}
          <Text strong> paginados </Text> e <Text strong>podem ser ordenados</Text> conforme necessidade.
        </Paragraph>

        <TableComponent page={page} pageSize={pageSize} loading={loading} data={data} />
      </Card>
    </div>
  );
}

export default TravelRequestsView;