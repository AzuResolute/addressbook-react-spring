import React from 'react'

const CapitalRow = ({capital}) => {
    const {state, name, population, squareMileage} = capital
  return (
    <tr>
        <td>{state}</td>
        <td>{name}</td>
        <td>{population}</td>
        <td>{squareMileage}</td>
    </tr>
  )
}

export default CapitalRow