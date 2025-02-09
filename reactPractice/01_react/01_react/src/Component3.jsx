import Component4 from "./Component4";


function Component3(props) {

  return (
    <>
      <h1>하위 컴포넌트3</h1>
      <Component4
        num={props.num}
        setNum={props.setNum}
      />
    </>
  );
}

export default Component3;
