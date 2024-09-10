import { Component } from "react";
import './style2.css'

class ChildToParent extends Component{

    state ={}

    getData=(name,sal,id,address)=>{
        this.setState({
            name:name,
            sal:sal,
            id:id,address:address
        })
    }

    render(){
        return(
            <div className="parent">
                <h3>Name:-{this.state.name}</h3>
                <h3>Sal:-{this.state.sal}</h3>
                <h3>Id:-{this.state.id}</h3>
                <h3>Address:-{this.state.address}</h3>

               <Child1 onChange={this.getData}/>
                <br/><br/><br/>

            </div>
        );
    }
}

class Child1 extends Component{

state ={name:'apple',sal:2342343,id:100,address:'india'}

onClickListener=()=>{
    this.props.onChange(this.state.name,this.state.sal,this.state.id,this.state.address);
}

    render(){
        return(
            <div className="child"><br/><br/>
               <button type="button" onClick={this.onClickListener}>sendData</button><br/><br/>
            </div>
        );
    }
}

export default ChildToParent;