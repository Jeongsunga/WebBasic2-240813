import React from 'react';
import CurlyBraces from './component/CurlyBraces';
import Component, {ClassComponent, FunctionComponent} from './component/Component' 
import Properties from './component_manage/Properties';
import ConditionalRender from './component_manage/ConditionalRender';
// export default X (여러 요소 export 가능) -> import {하나의 요소}(이름 변경 시 as 사용) from ...  
// export default O (반드시 하나의 요소만 export) -> import 하나의 요소(이름 변경 가능) from ...
import './App.css';
import Example2 from './example/Example2';
import ListRender from './component_manage/ListRender';
import EventComponent from './interaction/EventComponent';
import StateComponent from './interaction/StateComponent';
import ForwardingStateComponent from './interaction/ForwardingStateComponent';
import HookComponent from './hook/HookComponent';
import HookComponent2 from './hook/HookComponent2';
import CustomHook from './hook/CustomHook';

function App() {
  return (
    <div>
      {/* <Component/> */}
      {/* <ClassComponent/> */}
      {/* <FunctionComponent/> */}
      {/* <CurlyBraces/> */}
      {/* <Properties/> */}
      {/* <ConditionalRender/> */}
      {/* <Example2/> */}
      {/* <ListRender/> */}
      {/* <EventComponent/> */}
      {/* <StateComponent/> */}
      {/* <ForwardingStateComponent/> */}
      {/* <HookComponent/> */}
      {/* <HookComponent2/> */}
      <CustomHook/>
    </div>
  );
}

export default App;
