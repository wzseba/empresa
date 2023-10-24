
# Polimorfismo abstract

Empresa Acme
![Logo](https://dev-to-uploads.s3.amazonaws.com/uploads/articles/th5xamgrr6se0x5ro4g6.png)


## Features

- Polimorfismo
- Herencia
- Class abstract
- Testing



## Documentation

Una Empresa conoce a todos sus empleados. Los empleados pueden ser de planta permanente o temporaria, ademas hay gerentes , que tambein son empleados de planta permanente, pero siguen un regimen salarial particular.

- Empleado de planta permanente cobra la cantidad de horas trabajadas por $3.000,mas antiguedad($1.000 por año de antiguedad), mas salario familiar.
- Empleado de planta temporaria, no cobra antiguedad, solo cobra cantidad de horas trabajadas por $2.000, mas salario familiar.
- Salario familiar es de $2.000 por cada hijo,
- Los empleados casados ademas cobran $1.000 por su esposa/o
- Un gerente cobra de manera similar a un empleado de planta permanente pero su hora trabajada vale$4.000, por antiguedad se le paga $1.500 por año, mientras que el salario familiar es de el mismo que el de lso empleados de planta permanente y temporal.


## Related

Implementaciones
- Defina e implente el mensaje montoTotal() en la clase Empresa, que retorna el monto total que la empresa debe pagar en concepto de sueldos a sus empleados.
- Provea un TesEmpresa para instanciar y testear sus sistema creando el siguente escenario y envie a la empresa el mensaje montoTotal() para obtener la liquidacion total.


## Running Tests

- Una empresa que permita agregar 4 empleados
- Un empleado temporal con 80hrs trabajadas, casado, sin hijos.
- Un empleado permanente(que no sea gerente) con 80 horas trabajadas, casado, con 2 hijos y 6 años de antiguedad.
- Un empleado permanente(que no sea gerente) con 160hrs trabajadas, soltero, sin hijos y con 4 años de antiguedad.
- Un gerente con 160hrs trabajadas, casado, 1 hijo y 10 años de antiguedad.

