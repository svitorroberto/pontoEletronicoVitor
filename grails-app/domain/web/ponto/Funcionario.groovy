package web.ponto

class Funcionario {
    String nome
    Long id

    static hasMany = [registros:Registro]

    static constraints = {
        nome(nullable:false)
        id(nullable:true)
    }
}
