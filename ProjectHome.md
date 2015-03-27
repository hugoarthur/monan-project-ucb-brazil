CORPUS GENERATOR:
SISTEMA DE CRIAÇÃO DE BASES TEXTUAIS



“Trabalho de Monografia apresentado a Pró-Reitoria de Graduação área Ciência da Computação da Univer-sidade Católica de Brasília (UCB), como requisito para obtenção do Título de Bacharel em Ciência da Computação”.


1. MOTIVAÇÃO

Este trabalho busca está inserido em uma pesquisa avaliativa sobre a produ-ção de conhecimento na área de confluência entre Gestão do Conhecimento e Tec-nologia da Informação, na área de bibliometria. Compreender, comparar, sistemati-zar e projetar tendências a partir do que vem sendo produzido e aplicado do ponto de vista científico, tecnológico e social nessa área pode balizar a atuação futura de pessoas e empresas com interesse nessa temática. No nosso caso específico, pre-tende-se implantar um sistema que apoie a construção de uma base de dados tex-tuais estruturada para posterior análise no sentido de extração de padrões que pos-sibilitem a compreensão dos avanços produzidos na referida área.
Mais especificamente, o trabalho está inserido em um projeto de pesquisa de-senvolvido no âmbito do Mestrado em Gestão do Conhecimento e Tecnologia da Informação (MGCTI) da Universidade Católica de Brasília cujo objetivo é desenvol-ver uma avaliação formativa acerca da produção científica de três programas de pós-graduação brasileiros. Além do MGCTI, a pesquisa considera a produção do Mestrado em Sistemas de Gestão da Universidade Federal Fluminense (UFF) e do Programa de Pós-Graduação em Engenharia e Gestão do Conhecimento da Univer-sidade Federal de Santa Catarina (UFSC). A pesquisa em questão tem como eixo principal reunir e analisar, sob o ponto de vista da construção do conhecimento, trabalhos derivados de orientação em pós-graduação inseridos na área de Gestão do Conhecimento e Tecnologia da Informação no Brasil. Essa iniciativa poderá influenciar a atuação futura dos próprios cursos e, consequentemente, dos resultados produzidos para a sociedade onde esse conhecimento é aplicado. Para isso, é necessária a aplicação de técnicas de análises de textos a uma base estruturada de dados textuais produzida a partir de um conjunto de textos (corpus), aqui representado pelo conjunto de teses e dissertações produzido nos três programas de pós-graduação citados.
Entretanto, não se identificou nenhuma ferramenta disponível para a preparação de dados para análise a partir de um corpus não estruturado. Daí a motivação para a concepção e o desenvolvimento de tal ferramenta.

3. PROPOSTA DO SISTEMA

O Sistema de Criação de Bases Textuais, ou Corpus Generator, é uma ferra-menta que auxilia na organização de dados textuais, em específico na etapa de pre-paração dos dados, onde o usuário irá processar texto para criação de uma base estruturada que será utilizada em uma para  posterior análise textual como, por e-xemplo, ferramentas de mineração de textos.  Seus usuários são de duas categorias: coordenador de projeto ou membro da equipe de trabalho. Para sua utilização, seus usuários devem fazer o login, via uma tela para esse fim, com suas opções corriqueiras (cadastramento, ajuda e opções de configuração).
Cabe ao coordenador do projeto criar um novo projeto, identificando por um nome fornecido pelo usuário e um número fornecido pelo sistema, e definir sua e-quipe. Cada membro dessa equipe é identificado com um nome, sua instituição, um login e uma senha. Caberá também ao coordenador do projeto definir o nome de cada  categoria (célula) de informação a ser considerada (por exemplo, título, resu-mo, palavras chave, metodologia, etc.).
Aos membros da equipe é permitido apenas o acesso às funcionalidades de povoamento, consulta e manutenção da base de dados em construção.
O coordenador pode, a qualquer momento, incluir uma nova célula ou excluir uma célula existente. Os usuários poderão, a qualquer momento, incluir comentários sobre a atividade executada, gerando, sob demanda, um Relatório de Acompanhamento.
Sob demanda, o sistema produz um arquivo XML com o conjunto de dados gerados até o momento.
