import { Component } from "react";

class Calculator extends Component{

    state={a:20,b:15,showResult:false};


    setA = e=>{this.setState({a:parseInt(e.target.value)})}

    setB = e=>{this.setState({b:parseInt(e.target.value)})}

    setShowResult = e=>{
        this.setState(prevstate =>{
            return {showResult: !prevstate.showResult}
        })
    }

    render(){
        return(<div>
        <div className="container">
        
        <div className="row">
                 
         <div className="col-md-4">
            <input type="text"  className='inputA' onChange={this.setA}/></div>
         <div className="col-md-4">   <input type="text" className='inputB' onChange={this.setB}/></div>

         <div className="col-md-4">   <button type ="button" onClick={this.setShowResult}>Result</button></div>
</div></div>

{this.state.showResult ?(

          <h4>  {'ADD :-' +(this.state.a+ this.state.b)}<br/>
            {'SUB :-' +(this.state.a- this.state.b)}<br/>
            {'MUL :-' +this.state.a* this.state.b}<br/>
            {'DIV :-' +this.state.a/ this.state.b}<br/>


            
            </h4>):(
                <div>Please click the result button to check the result</div>
            )}
        </div>);
    }
}

export default Calculator;