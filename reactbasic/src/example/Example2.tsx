import React from 'react'
import './Example2.css'

function TableHeader(){
    return(
        <div className='th'>
            <div className='td'>사번</div>
            <div className='td'>이름</div>
            <div className='td'>출근 상태</div>
        </div>
    )
}

interface TableRowProps {
    employeeNumber: string;
    employeeName: string;
    workState: boolean;
}

function TableRow({employeeNumber, employeeName, workState}: TableRowProps){

    const color = workState ? 'blue' : 'red'

    return (
        <div className='tr'>
            <div className='td'>{employeeNumber}</div>
            <div className='td'>{employeeName}</div>
            <div className='td' style={{color}}>●</div>
        </div>
    )
}

interface TableDateTrProps {
    type: 'tr';
    employeeNumber: string;
    employeeName: string;
    workState: boolean;
}

interface TableDataThProps {
    type: 'th'
}

function TableData(props: TableDataThProps | TableDateTrProps){

    const {type} = props

    if(type === 'th'){
        return (
            <div className='th'>
                <div className='td'>사번</div>
                <div className='td'>이름</div>
                <div className='td'>출근 상태</div>
            </div>
        )
    }

    const {employeeNumber, employeeName, workState} = props
    const color = workState ? 'blue' : 'red'

    if(type === 'tr'){
        return (
            <div className='tr'>
                <div className='td'>{employeeNumber}</div>
                <div className='td'>{employeeName}</div>
                <div className='td' style={{color}}>●</div>
            </div>
        )
    }
}

export default function Example2() {

    const employee1 = {
        employeeNumber :'202401',
        employeeName : '홍길동',
        workState : false
    }

    const employee2 = {
        employeeNumber :'202402',
        employeeName : '이영희',
        workState : true
    }

    const employee3 = {
        employeeNumber :'202403',
        employeeName : '김철수',
        workState : false
    }


  return (
    <div>
        {/* <div className='table'>
            <TableHeader/>
            <TableRow {...employee1}/>
            <TableRow {...employee2}/>
            <TableRow {...employee3}/>
        </div> */}

        {/* <div className='table'>
            <TableData type='th'/>
            <TableData type='tr' {...employee1}/>
            <TableData type='tr' {...employee2}/>
            <TableData type='tr' {...employee3}/>
        </div> */}

        {/* <div className='table'>
            <TableHeader/>
            <TableRow {...employees[0]}/>
            <TableRow {...employees[1]}/>
            <TableRow {...employees[2]}/>
        </div> */}

        <div className='table'>
            <TableHeader/>
            {employees.map((employee, index) => <TableRow key={index} {...employee}/>)}
        </div>
    </div>
  )
}

const employees = [
    {
        employeeNumber :'202401',
        employeeName : '홍길동',
        workState : false
    },
    {
        employeeNumber :'202402',
        employeeName : '이영희',
        workState : true
    },
    {
        employeeNumber :'202403',
        employeeName : '김철수',
        workState : false
    }
]
