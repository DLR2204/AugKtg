import { useState } from "react";


function Button1(){

    const [title] = useState('Click Here');

    

    return(
        <div>
            <button type="button">{title}</button>
        </div>
    );
}

export default Button1;