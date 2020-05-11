
import React, {Component} from 'react'
import {withRouter, Route, Switch} from 'react-router-dom'
import CapitalsTable from './components/capitals/CapitalsTable'
import Welcome from './components/Welcome'

class Routes extends Component {

  render() {

    return (
        <Switch>
            <Route path="/capitals/:category/:value" component={CapitalsTable} />
            <Route path="/capitals/" component={CapitalsTable} />
            <Route path="/" component={Welcome} />
        </Switch>
    )
  }
}

export default withRouter(Routes);