const root = document.getElementById('root');

function Candidato(props) {

    const [votos, setVotos] = React.useState(0);

    function votar(){
        setVotos(votos+1);
        console.log(votos+1);
        if (votos+1 == 5){
            alert(`votos ${votos+1}`);
        }
    }

    return (
        <>
            <h1>{props.nome}</h1>
            <h2> Votos: {votos}</h2>
            <button onClick={votar}>Votar</button>
        </>
    )
}

function Votacao() {
    return (
        <>
            <Candidato nome="Batata Frita"/> <br/>
            <Candidato nome="Batata com cebola"/> <br/>
            <Candidato nome="Batata Assada"/> <br/>
            <Candidato nome="Batata Rústica"/> <br/>
            <Candidato nome="Batata Palha"/> <br/>
        </>
    )
}



ReactDOM.createRoot(root).render(<Votacao/>);