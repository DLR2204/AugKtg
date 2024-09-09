import { Component } from "react";


class ParentToChild extends Component{
state={
    name:'apple',id:100,salary:23442342,address:'hyderabad'
}

    render(){
        return(<div>

            <Child name={this.state.name} id={this.state.id} salary={this.state.salary} address={this.state.address}/>
        </div>);
    }
}


class Child extends Component{
    render(){
        return(<div>
            <h3>
               <u>Employee details are:-</u><br/>
               Name:{this.props.name} <br/>
               Id: {this.props.id} <br/>
               Salary: {this.props.salary}<br/>
               Address: {this.props.address}<br/>

            </h3>

        </div>);
    }
}

export default ParentToChild;