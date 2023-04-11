#language: pt
Funcionalidade: Consulta de CEP
Cenário: Validar informações de CEP e código de rastreamento nos Correios

Dado que eu estou no site dos Correios
Quando eu procuro pelo CEP "80700000"
Então eu devo confirmar que o CEP não existe
E eu volto para a tela inicial

Quando eu procuro pelo CEP "01013-001"
Então eu devo confirmar que o resultado é "Rua Quinze de Novembro, São Paulo/SP"
E eu volto para a tela inicial

Quando eu procuro pelo código de rastreamento "SS987654321BR"
Então eu devo confirmar que o código não está correto
E eu fecho o browser
