import { Spin } from 'antd';
import React, { type JSX } from 'react';

/**
 * LoadingIndicator component displays a loading spinner while data is being fetched or processed.
 * @returns {JSX.Element} A centered loading spinner element.
 */
function LoadingIndicator (): JSX.Element {
  return (
    <div style={{ textAlign: 'center', marginTop: '20px' }}>
      <Spin size="large" />
    </div>
  );
};

export default LoadingIndicator;
