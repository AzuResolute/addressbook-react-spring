import React, { Component } from 'react'

export default class CapitalsTable extends Component {
    render() {
        return (
            <table className="w-100 blue-table">
                <tr>
                    <th>State</th>
                    <th>Capital</th>
                    <th>Population</th>
                    <th>Square Mileage</th>
                </tr>
                <tr>
                    <td>Alabama</td>
                    <td>Montgomery</td>
                    <td>205764</td>
                    <td>155.4</td>
                </tr>
                <tr>
                    <td>Montana</td>
                    <td>Helena</td>
                    <td>28190</td>
                    <td>14.0</td>
                </tr>
                <tr>
                    <td>Washington</td>
                    <td>Olympia</td>
                    <td>46478</td>
                    <td>16.7</td>
                </tr>
            </table>
        )
    }
}
