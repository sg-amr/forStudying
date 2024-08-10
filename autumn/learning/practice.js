const numberA =1
const numberB=2
console.log (numberA + numberB)

const object = {
                str1:"hello",
                str2:"world"
                }
            document.write (object.str1 + object.str2);

const list = [1,2,3,4,5];
               
for (let i = 0; i < list.length; i++) {
    console.log(list[i]);
}

var str = "Autumn"
 document.write (str.length)
const istrue = 10 == 20;
if(istrue){
    document.getElementById("example").textContent = "true";
}else{
    document.getElementById("example").textContent = "false";
}

var num = 10; // 変数の代入

console.log( num );
console.log( num += 3 ); //3を加算して代入
console.log( num -= 3 ); //3を減算して代入
console.log( num *= 2 ); //2を乗算して代入
console.log( num /= 4 ); //4を除算して代入
console.log( num %= 2 ); //2で割った余りを代入