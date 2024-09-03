import './style.css';

function Movie(props){

    return(
        <div className="movie-card">

            <img src={props.banner}/>
            <br/><h4 align="center">{props.title}</h4>


        </div>
    );
}

export default Movie;