import Component2 from "./Component2";


function Component1(props) {

  return (
    <>
      <h1>하위 컴포넌트1</h1>
      <Component2
        num={props.num}
        setNum={props.setNum}
      />
      
    </>
  );
}

export default Component1;
