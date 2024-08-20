import React from 'react';
import CurlyBraces from './component/CurlyBraces';
import Component, {ClassComponent, FunctionComponent} from './component/Component' 
import Properties from './component_manage/Properties';
import ConditionalRender from './component_manage/ConditionalRender';
// export default X (여러 요소 export 가능) -> import {하나의 요소}(이름 변경 시 as 사용) from ...  
// export default O (반드시 하나의 요소만 export) -> import 하나의 요소(이름 변경 가능) from ...
import './App.css';
import Example2 from './example/Example2';

function App() {
  return (
    <div>
      {/* <Component/>
      <ClassComponent/>
      <FunctionComponent/>
      <CurlyBraces/>
      <Properties/>
      <ConditionalRender/> */}
      <Example2/>
    </div>
  );
}

export default App;
