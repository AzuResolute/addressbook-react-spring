import React, { Component } from 'react'
import {Navbar, Nav, Form, FormControl, Button, FormLabel} from 'react-bootstrap'

export default class Navigation extends Component {
    render() {
        return (
        <Navbar bg="primary" variant="dark">
            <Navbar.Brand href="#home">CapitalsApp</Navbar.Brand>
            <Nav className="mr-auto d-flex justify-content-around">
              <Nav.Link href="#home">Home</Nav.Link>
              <Nav.Link href="#features">All Capitals</Nav.Link>
              <Form inline className="mx-2">
                <FormLabel variant="outline-light"  className="mx-1 text-light">Square Mileage less than:</FormLabel>
                <FormControl type="number" placeholder="1000" className="mr-sm-2" />
                <Button variant="outline-light">Search</Button>
              </Form>
              <Form inline className="mx-2">
                <FormLabel variant="outline-light"  className="mx-1 text-light">Population less than:</FormLabel>
                <FormControl type="number" placeholder="200.00" className="mr-sm-2" />
                <Button variant="outline-light">Search</Button>
              </Form>
            </Nav>
          </Navbar>
        )
    }
}
