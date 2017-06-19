package web.ponto

import org.joda.time.DateTime

class Registro {
    Long id
    DateTime batidaDePonto

    static belongsTo = Funcionario

    static constraints = {
        id(nullable:true)
        batidaDePonto(nullable:false)
    }
}
