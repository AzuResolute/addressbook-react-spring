import React, { Component } from 'react'
import ReactDOM from 'react-dom'
import {Router} from 'react-router-dom'
import Navigation from './components/Navigation'
import CapitalsTable from './components/capitals/CapitalsTable'

class App extends Component {

	render() {
		console.log(document.URL)
		return (
			<div className="text-center">
				<Navigation/>
				<h1>Hello StateCapitals</h1>
				<CapitalsTable/>
			</div>
		)
	}
}

ReactDOM.render(
	<App />,
	document.getElementById('react')
)