import React, { Component, Fragment } from 'react'
import axios from 'axios'
import CapitalRow from './CapitalRow'
import CapitalParameters from './CapitalParameters'

export default class CapitalsTable extends Component {

    constructor(props) {
        super(props)
    
        this.state = {
            capitals: [],
            category: "",
            limitAmount: 0
        }
    }
    

    render() {
        return (
            <Fragment>
                <CapitalParameters/>
                <table className="w-100">
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
            </Fragment>
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
        const {category, limitAmount} = this.state
        let apiRoute = ""
        switch(category) {
            case "population":
                apiRoute = `/api/capitals/limit/population/${limitAmount}`;
                break;
            case "squareMiles":
                apiRoute = `/api/capitals/limit/squareMiles/${limitAmount}`;
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

    // handleChange = async e => {
    //     await this.setState({
    //       [e.target.name]: e.target.value
    //     })
    //   }
}
