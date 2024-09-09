import { Component } from "react";

class Calculator extends Component{

    state={a:20,b:15};


    setA = e=>{this.setState({a:parseInt(e.target.value)})}

    setB = e=>{this.setState({b:parseInt(e.target.value)})}

    render(){
        return(<div><h4>
            <input type="text"  className='inputA' onChange={this.setA}/>
            <input type="text" className='inputB' onChange={this.setB}/>

        <button type ="button">Show Result</button><br/><br/><br/>

            {'ADD :-' +(this.state.a+ this.state.b)}<br/>
            {'SUB :-' +(this.state.a- this.state.b)}<br/>
            {'MUL :-' +this.state.a* this.state.b}<br/>
            {'DIV :-' +this.state.a/ this.state.b}<br/>


            
            </h4>
        </div>);
    }
}

export default Calculator;