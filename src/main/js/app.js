import React, { Component } from 'react'
import ReactDOM from 'react-dom'
import {Router} from 'react-router-dom'

class App extends Component {

	render() {
		console.log(document.URL)
		return (
			<h1>Hello App</h1>
		)
	}
}

ReactDOM.render(
	<App />,
	document.getElementById('react')
)