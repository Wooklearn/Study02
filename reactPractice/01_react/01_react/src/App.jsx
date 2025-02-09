import { useState } from "react";
import Component1 from "./Component1";
import Component6 from "./Component6";


function App() {
  const [num, setNum] = useState();

  return (
    <>
      <h1>num 숫자 세팅</h1>
      <Component1
        num={num}
        setNum={setNum}
      />
       <Component6
        num={num}
      />
    </>
  );
}

export default App;
