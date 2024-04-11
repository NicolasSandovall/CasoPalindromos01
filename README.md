Preguntas:
¿Qué hace el método?
Recibe una cadena, la invierte y pregunta si es igual (si es que es o no un palindromo)con un true o false.


¿Cómo lo hace y como lo uso?
Recibe una cadena
Utiliza la funcion split para divir la cadena cada vez que haya un espacio en blanco
El metodo reverse nos invierte los datos de los string
El metodo join() nos combina la todos los elemntos separados por un espacio y los une en un string
Los "===" pregunta si son iguales y devuelve un booleano

Dé al menos un ejemplo de su uso (sin codificar nada).
Recibe = "adan nada"
Split separa = "adan","nada"
Reverse invierte = ""adan", "nada""
Join une los string en uno espacio= "adan nada"
"===" arroja True

CASOS DE PRUEBA
1. con solo una letra
2. una frase con espacios
3. Ingresan caracteres
4. espacio vacio
5. Con mayuscula

¿Qué resultados arrojan sus Test con estas entradas: “aca”, “acas”, “h”?
1. Verdadero
2. Falso
3. Verdadero

ANALISIS:
- Caso de prueba 1:
Input: 200 (número entero)
Output: Falso

- Caso de prueba 2:
Input: “” (cadena vacía)
Output: Falso

- Caso de prueba 3:
Input: “aaabccbaaa”
Output: Verdadero a palindromo

- Caso de prueba 4:
Input: “ahabccbaaa”
Output: Falso

- Caso de prueba 5:
Input: “La tele letal”
Output: Verdadero a palindromo

CONCLUSION:
¿Qué consideraciones tomaron en cuenta?
Cubrir la mayor cantidad de casos: cantidad minima de letras y si se ingresa un numero.

¿Qué mejoró en su método?
palindromos con caracteres, cadenas vacias, palindromos con espacio y todo con minuscula.


¿Qué rol jugaron las pruebas en mejorar su código?
Verificar que los metodos estuvieran bien implementados.


