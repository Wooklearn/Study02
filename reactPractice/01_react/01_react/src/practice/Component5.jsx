

function Component5(props) {

  return (
    <>
      <h1>하위 컴포넌트5</h1>
      <h2>{props.num}</h2>
      <button onClick={()=>{
        props.setNum(50)
      }}>num setting</button>
    </>
  );
}

export default Component5;
