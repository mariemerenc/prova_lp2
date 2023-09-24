# prova_lp2

Implementação da questão proposta na 1ª prova da disciplina LP2


Crie uma classe “Produto” que possua os atributos “nomeloja” e “preco”, crie os métodos sets e gets
para estes atributos. Crie também o atributo “descrição” e seu método chamado “getDescricao” que
retorna uma string com o simples conteúdo “Produto de informática”;

Crie duas classes filhas de “Produto”, que serão “Mouse” com o atributo “tipo” e “Livro” com o
atributo “autor”, no método construtor de cada uma dessas classes passe como argumento a descrição
desse produto, por exemplo, Mouse(“Mouse ótico, Saída USB. 1.600 dpi”); Crie o método
“getDescricao” que retorna a descrição que foi passada no argumento do construtor concatenada com
o atributo que a classe tiver, “autor” no caso de livro e “tipo” no caso de mouse, esse método deve ter
a mesma assinatura do método “getDescricao” da classe pai “Produto”;

Crie uma classe “Main” que irá simular a compra de um cliente de vários mouses e livros, deve haver
apenas um arraylist na classe “Main” para armazenamento de todos os livros e mouses. Esse arraylist
deve se chamar “carrinho” que simula o carrinho de compras de produtos variados de um cliente em
um e-commerce. Insira nesse “carrinho” vários mouses e livros e depois chame o método
“getDescricao” de todos os objetos presentes no arraylist. Para o usuário do carrinho saber as
informações dos produtos em seu carrinho.

Para a execução do projeto, basta digitar no terminal:
``javac Main.java``

E, em seguida:
``java Main``
