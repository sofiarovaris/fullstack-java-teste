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
  const [page, setPage] = useState<number>(1);
  const [pageSize] = useState<number>(5);
  const [total, setTotal] = useState<number>(0);  // Adicionado para total de itens

  /**
   * Asynchronously loads the travel requests data from the API and sets the state.
   * This function is called when the user clicks the 'Buscar' button.
   * It also manages the loading state to show the loading spinner during data fetch.
   */
  async function loadData() {
    setLoading(true);
    const response = await fetchTravelRequests();
    setData(response.data);
    setTotal(response.data.length);
    setLoading(false);
  }

  return (
    <div
      style={{
        display: 'flex',
        justifyContent: 'center',
        alignItems: 'center',
        height: '100vh',
        backgroundColor: '#f0f2f5',
        padding: '20px',
        flexDirection: 'column',
      }}
    >
      <Card
        bordered={false}
        style={{
          width: '100%',
          maxWidth: '1000px',
          height: 'auto',
          minHeight: '500px',
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
              flexDirection: 'row',
              flexWrap: 'wrap',
            }}
          >
            <Title level={3} style={{ margin: 0, flex: 1 }}>
              Desafio Lemontech - Pesquisar solicitações de viagens
            </Title>
            <Button type="primary" onClick={loadData} style={{ marginTop: '10px' }}>
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

        <TableComponent page={page} pageSize={pageSize} loading={loading} data={data} total={total} setPage={setPage} />
      </Card>
    </div>
  );
}

export default TravelRequestsView;