#1. Nome, data de nascimento e peso do atleta mais alto;
select nome, dataDeNascimento, altura, peso
from atleta
where altura = (select max(altura) from atleta);

#1.1 do atleta maior
select nome, dataDeNascimento, peso
from atleta
where peso = (select max(peso) from atleta);
#1.2 do menor atleta
select nome, dataDeNascimento, altura, peso
from atleta
where altura = (select min(altura)from atleta);

#2. Nome do treinador de um determinado time; 
#busca por nome
select t.tecnicoTime
from time t
where t.nomeTime ='Atlanta Hawks';
#2.1 - Busca por ID
select t.tecnicoTime
from time t
where t.idTime =2110004;

3. Times treinados por um determinado treinador; 
#busca por id
select t.tecnicoTime
from time t
where t.chaveE_Tecnico = 2120002;



4. Times que participaram de um determinado jogo (partida) realizado na data tal;
#Entre datas
select P.nomeTimeCasa, P.nomeTimeVisitante, P.idPartida, P.modalidade
from partida P
where P.dataJogo between '2019/01/01' and '2019/12/31';
5. Time vencedor de um determinado jogo; 


6. Número de jogos da modalidade tal, realizados durante o ano de 2019;
# Numero total de jogos por modalidade
select P.nomeTimeCasa, P.nomeTimeVisitante, P.idPartida, P.modalidade
from partida P
where (P.dataJogo between '2019/01/01' and '2019/12/31') and modalidade = '5x5';
7. Time que venceu o maior número de jogos de uma determinada modalidade.