import { Spin } from 'antd';
import React from 'react';

function LoadingIndicator () {
  return (
    <div style={{ textAlign: 'center', marginTop: '20px' }}>
      <Spin size="large" />
    </div>
  );
};

export default LoadingIndicator;
