# Spring Boot WebSocket Demo

Incluindo o lado do servidor, bem como js, ​​cliente Java (a porta padrão é 8080)
O objeto xxxMessage no modelo deve ter um construtor sem parâmetro padrão, caso contrário, a assinatura do tópico do cliente Java é inválida (nenhum erro será relatado!)
A classe de entrada DemoWebSocketServer no lado do servidor não deve ser movida para outros subpacotes, caso contrário, o cliente não será conectado.
A entrada do lado do cliente java é DemoWebSocketClient. Após conectar ao lado do servidor, digite Enter no lado do terminal para enviar uma mensagem ao servidor.
O endereço do lado do cliente js é http: // localhost: 8080 / Conecte primeiro e, em seguida, envie
