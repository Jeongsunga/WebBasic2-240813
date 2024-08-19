import React from 'react';
import Component, {ClassComponent, FunctionComponent} from './component/Component' 
// export default X (여러 요소 export 가능) -> import {하나의 요소}(이름 변경 시 as 사용) from ...  
// export default O (반드시 하나의 요소만 export) -> import 하나의 요소(이름 변경 가능) from ...
import './App.css';

function App() {
  return (
    <div>
      <Component/>
      <ClassComponent/>
      <FunctionComponent/>
    </div>
  );
}

export default App;
