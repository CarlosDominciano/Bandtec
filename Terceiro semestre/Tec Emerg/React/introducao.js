const root = window.document.getElementById('root');

// const titulo = window.document.createElement('h1');
// titulo.innerHTML = "MEU PRIMEIRO TITULO COM JS";
// root.appendChild(titulo);

function Titulo(props) {
    return (
        <>  
        <h1>{props.texto}</h1>
        </> //React.Fragment
    );
}

function Titulos() {
    return (
        <>
            <Titulo texto="Este é o 1 titulo"/>
            <Titulo texto="Este é o 2 titulo"/>
            <Titulo texto="Este é o 3 titulo"/>
            <Titulo texto="Este é o 4 titulo"/>
            <Titulo texto="Este é o 5 titulo"/>
        </>
    )
}

ReactDOM.createRoot(root).render(<Titulos/>)
