

//変更できない変数listを定義・初期値代入
const list = [1,2,3,4,5,6,7,8,9];


//配列を順番通りにconsoleで出力
console.log("list 0 is" + list[0]);
console.log("list 1 is" + list[1]);
console.log("list 2 is" + list[2]);



//変更できない変数objectを定義・初期値代入
const object = {
    key1: "key1 content",
    key2: "key2 content",
    key3: "key3 content"
}


//それぞれをconsoleで出力
console.log("key1 is " + object.key1);
console.log("key2 is " + object.key2);
console.log("key3 is " + object.key3);

//変数→中に、でーたを入れる。
//データの種類=データ型（）
//number
//string
//bool値-真偽値
true;
false;

const a = (10 == 20);

if (a) {
    //trueの時の処理
    console.log("output is true");
} else {
    //falseの時の処理
    console.log("output is false");
}

//null
//明示的に、何も入っていないことを示す。

//undefined
//すべての変数の初期値
let variable;
console.log(variable);
variable = 1;
console.log(variable);

//object
//配列
//object