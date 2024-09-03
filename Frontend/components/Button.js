import { Component } from "react";

class Button extends Component{

    state={
        title:'surya'
    }

    render(){
        return(<div>
            <button type="button">{this.state.title}</button>

        </div>);
    }
}

export default Button;