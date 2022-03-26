import 'bootstrap/dist/css/bootstrap.min.css';
import React, { useEffect } from 'react'
import From from '../components/From'
import Result from '../components/Result'
import {useDispatch} from 'react-redux'
import { fetchRandom, nuevaMano } from '../actions';

const App = () =>  {// component stateful
  
  let dispatch = useDispatch();
  useEffect(() => {
    dispatch(fetchRandom())
  },[])

    return (
      <div>
        <h3>Lsta de manos random de Poker</h3>
        <From />
        <Result />
      </div>
    )
  }

export default App


