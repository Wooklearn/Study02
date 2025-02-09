import Component5 from "./Component5";


function Component4(props) {

  return (
    <>
      <h1>하위 컴포넌트4</h1>
      <Component5
        num={props.num}
        setNum={props.setNum}
      />
    </>
  );
}

export default Component4;
