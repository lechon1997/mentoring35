import React from 'react'
import { connect } from 'react-redux';
import {useSelector} from 'react-redux'

const Result = (props) => {
  const {random} = useSelector((state) => state)
  console.log("listina xd:", random);
  
  return (
    <div className="d-flex flex-wrap w-100">
      {random.result.map(datito => <div className="d-flex me-5 mt-5" key={datito.id}> <img src={datito.card1}/><img src={datito.card2}/></div>)}
  </div>
  )
}


const stateMapToPros = state => {
  return {
    result: state.random.result?.randomList
  }
}


export default connect(stateMapToPros)(Result)
