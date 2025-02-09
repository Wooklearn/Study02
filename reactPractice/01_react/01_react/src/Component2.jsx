import Component3 from "./Component3";


function Component2(props) {

  return (
    <>
      <h1>하위 컴포넌트2</h1>
      <Component3
        num={props.num}
        setNum={props.setNum}
      />
    </>
  );
}

export default Component2;
