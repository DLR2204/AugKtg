import { Component } from "react";
import PropsEx from './PropsEx'
import './style1.css';
import list from './list';

class Movie extends Component{

    state={
       ...list
    }


    getMovie = lists=>{

    return    <PropsEx banner={lists.banner} title={lists.title}/>;

    }




    render(){
        return(<div className="movies-section">
            <div className="row">
        {this.getMovie(this.state.stree)}
        {this.getMovie(this.state.comdey)}
        {this.getMovie(this.state.yaar)}
        {this.getMovie(this.state.tuesday)}
        {this.getMovie(this.state.show)}
            


</div>
</div>);
    }
}

export default Movie;