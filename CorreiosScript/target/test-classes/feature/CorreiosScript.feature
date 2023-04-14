#language: pt
Funcionalidade: Consulta de CEP e rasteamento de encomendas pelos Correios
Cenario: Verificar se o CEP 80700000 não existe
  Dado que estou no site dos Correios
  Quando informo o CEP "80700000" na busca
  Então vejo a mensagem "Endereço não encontrado"
  E volto para a página inicial

  Cenario: Verificar se o CEP 01013-001 está correto
    Dado que estou no site dos Correios
    Quando informo o CEP "01013-001" na busca
    Então vejo o endereço "Rua Quinze de Novembro, São Paulo/SP"
    E volto para a página inicial

  Cenario: Verificar se o código de rastreamento SS987654321BR é inválido
    Dado que estou no site dos Correios
    Quando informo o código "SS987654321BR" na busca de rastreamento
    Então vejo a mensagem "Código de objeto inválido"
    E fecho o navegador