import React, { useEffect, useState } from 'react'

// Custom Hook
// - 리액트에서는 훅 함수의 호출은 반드시 함수형 컴포넌트 코드 블럭에서만 호출 가능
// - 함수명을 use로 시작하는 이름으로 작성하여 커스텀 훅 함수를 만들 수 있음
// - 커스텀 혹에는 다른 혹 함수들이 포함될 수 있음

const useStateFunction = () => {
    const [state1, setState1] = useState<number>(0);
    const [state2, setState2] = useState<number>(0);

    useEffect(() => {
        console.log('state1 변경!')
    }, [state1]);

    useEffect(() => {
        console.log('state2 변경!');
    }, [state2]);

    useEffect(() => {
        console.log('state1 혹은 state2 변경!');
    }, [state1, state2]);

    return {state1, state2, setState1, setState2}
}

export default function CustomHook() {
        
    const {state1, state2, setState1, setState2} = useStateFunction()

    const onState1Add = () => {
        setState1(state1 + 1);
    }

    const onState2Add = () => {
        setState2(state2 + 1);
    }

  return (
    <div>
        <div>{state1} <button onClick={onState1Add}>state1 +</button></div>
        <div>{state2} <button onClick={onState2Add}>state2 +</button></div>
        <SubComponent/>
    </div>
  )
}

function SubComponent() {

    const {state1, state2, setState1, setState2} = useStateFunction()
    const onState1Add = () => {
        setState1(state1 + 1);
    }

    const onState2Add = () => {
        setState2(state2 + 1);
    }


    return (
        <div>
            <div>{state1} <button onClick={onState1Add}>state1 +</button></div>
            <div>{state2} <button onClick={onState2Add}>state2 +</button></div>
        </div>
    )
}
