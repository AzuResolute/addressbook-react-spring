import React, { Component } from 'react'
import {Form, FormControl, Button, FormLabel} from 'react-bootstrap'

export default class CapitalParameters extends Component {
    render() {
        return (
            <div className="d-flex justify-content-around">
                <Form inline className="mx-2">
                    <FormLabel variant="outline-light"  className="mx-1">Square Mileage less than:</FormLabel>
                    <FormControl type="number" placeholder="0" className="mr-sm-2" />
                    <Button variant="outline-primary">Search</Button>
                </Form>
                <Form inline className="mx-2">
                    <FormLabel variant="outline-light"  className="mx-1">Population less than:</FormLabel>
                    <FormControl type="number" placeholder="0" className="mr-sm-2" />
                    <Button variant="outline-primary">Search</Button>
                </Form>
            </div>
        )
    }
}
