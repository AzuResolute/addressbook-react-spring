import React, { Component, Fragment } from 'react'
import axios from 'axios'
import CapitalRow from './CapitalRow'

export default class CapitalsTable extends Component {

    constructor(props) {
        super(props)
    
        this.state = {
            capitals: []
        }
    }
    

    render() {
        return (
            <table className="w-100 blue-table">
                <thead>
                    <tr>
                        <th>State</th>
                        <th>Capital</th>
                        <th>Population</th>
                        <th>Square Mileage</th>
                    </tr>
                </thead>
                <tbody>
                    {this.renderEachCapital(this.state.capitals)}
                </tbody>
            </table>
        )
    }

    renderEachCapital = (capitals) => {
        return (
            <Fragment>
                {capitals.map(c => <CapitalRow capital={c} key={c.state} />)}
            </Fragment>
        )
    }

    componentDidMount = () => {
        const apiRoute = this.selectLoadCategory();
        this.loadFromSpring(apiRoute);
    }

    selectLoadCategory = () => {
        const {category, value} = this.props.match.params
        console.log(category)
        let apiRoute = ""
        switch(category) {
            case "population":
                apiRoute = `/api/capitals/limit/population/${value}`;
                break;
            case "squareMiles":
                apiRoute = `/api/capitals/limit/squareMiles/${value}`;
                break;
            default:
                apiRoute = "/api/capitals/";
                break;
        }
        return apiRoute
    }

    loadFromSpring = async (apiRoute) => {
        const {data} = await axios.get(apiRoute)
        this.setState({capitals: data})
    }
}
