import React, { useState, useEffect } from 'react'
import { connect } from 'react-redux';
import { fetchRandom, nuevaMano } from '../actions';
import {useDispatch} from 'react-redux'

const From = (props) => {// component stateless
  let dispatch = useDispatch();
  const onSubmit = (e) => {
    e.preventDefault();
    dispatch(nuevaMano());
  };

  return <div>
    <form onSubmit={onSubmit}>
      <br />
      <button type="submit" disabled={props.loading}>
        nueva mano
      </button>
    </form>
  </div>
}


const stateMapToPros = state => {
  return {
    loading: state.view.loading
  }
}


export default connect(stateMapToPros)(From)
