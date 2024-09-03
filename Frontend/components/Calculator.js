import { Component } from "react";

class Calculator extends Component{

    state={a:20,b:15};

    render(){
        return(<div><h4>
            <input type="text"  className='inputA' onChange={e=>{this.setState({a:e.target.value})}}/>
            <input type="text" className='inputB' onChange={e=>{this.setState({b:e.target.value})}}/><br/>

        

            {'ADD :-' +(this.state.a+ this.state.b)}<br/>
            {'SUB :-' +(this.state.a- this.state.b)}<br/>
            {'MUL :-' +this.state.a* this.state.b}<br/>
            {'DIV :-' +this.state.a/ this.state.b}<br/>


            
            </h4>
        </div>);
    }
}

export default Calculator;