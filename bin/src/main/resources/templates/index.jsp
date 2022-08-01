
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" 
    xmlns:th="http://www.thymeleaf.org" 
    xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3"
    xmlns:layout="http://www.ultraq.net.nz/thymeleaf/layout">

    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Stefanini Teste</title> 
        <link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600" rel="stylesheet">        
    </head>
    
    <body> 
        <div id="contact-us" class="contact-us small-12 columns no-padding inline"> 
            <div class="contact-form small-12 medium-10 large-6 columns no-padding small-centered">
                <form action="https://postmail.invotes.com/send" method="post" id="email_form">

                    <form action="pastadestino.php" method="POST">
                        <div class="form-row">
                            <div class="form-group col-md-6">
                                <label for="inputName">Nome</label>
                                <input type="text" id="nmPessoa" class="form-control" placeholder="Claudinei" required>
                            </div>
                            <div class="form-group col-md-6">
                                <label for="inputEmail4">Email</label>
                                <input type="email" class="form-control" id="email" placeholder="meu_email@email.com" required>
                            </div>

                            <div class="form-group">
                                <label for="inputAddress">Data de Nacimento</label>
                                <input type="text" class="form-control" id="dtNascimento" placeholder="01/01/1000" required>
                            </div>
                            <div class="form-group">
                                <label for="inputAddress">Naturalidade</label>
                                <input type="text" class="form-control" id="naturalidade" placeholder="São Vincente - SP" required>
                            </div>
                            <div class="form-group">
                                <label for="inputAddress">Nacionalidade</label>
                                <input type="text" class="form-control" id="nacionalidade" placeholder="Brasileiro(a)" required>
                            </div>

                            <div class="form-group col-md-6">
                                <label for="inputSurname">Nº do Documento</label>
                                <input type="text" class="form-control" id="nrDocumento" placeholder="000000000-00" required>
                            </div>

                            <div class="form-group col-md-6">
                                <label for="inputPassword4">Sexo</label>
                                <input type="text" class="form-control" id="sexo" placeholder="Masculino, feminino, outros" required>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputAddress">Endereço</label>
                            <input type="text" class="form-control" id="inputAddress" placeholder="Av Vinicius de Morais, 25" required>
                        </div>
                        <div class="form-group">
                            <label for="inputAddress">Cep</label>
                            <input type="text" class="form-control" id="cep" placeholder="Av Vinicius de Morais, 25" required>
                        </div>
                        <div class="form-group">
                            <label for="inputAddress2">Complemento</label>
                            <input type="text" class="form-control" id="inputAddress2" placeholder="Apartamento, casa, sítio...">
                        </div>
                        <div class="form-row">
                            <div class="form-group col-md-6">
                                <label for="inputCity">Cidade</label>
                                <input type="text" class="form-control" id="inputCity" required>
                            </div> >
                            <div class="form-group col-md-4">
                                <label for="inputState">Estado</label>
                                <select id="inputState" class="form-control" required>
                                    <option selected hidden>Escolha...</option>
                                    <option value="AC">Acre</option>
                                    <option value="AL">Alagoas</option>
                                    <option value="AP">Amapá</option>
                                    <option value="AM">Amazonas</option>
                                    <option value="BA">Bahia</option>
                                    <option value="CE">Ceará</option>
                                    <option value="DF">Distrito Federal</option>
                                    <option value="ES">Espírito Santo</option>
                                    <option value="GO">Goiás</option>
                                    <option value="MA">Maranhão</option>
                                    <option value="MT">Mato Grosso</option>
                                    <option value="MS">Mato Grosso do Sul</option>
                                    <option value="MG">Minas Gerais</option>
                                    <option value="PA">Pará</option>
                                    <option value="PB">Paraíba</option>
                                    <option value="PR">Paraná</option>
                                    <option value="PE">Pernambuco</option>
                                    <option value="PI">Piauí</option>
                                    <option value="RJ">Rio de Janeiro</option>
                                    <option value="RN">Rio Grande do Norte</option>
                                    <option value="RS">Rio Grande do Sul</option>
                                    <option value="RO">Rondônia</option>
                                    <option value="RR">Roraima</option>
                                    <option value="SC">Santa Catarina</option>
                                    <option value="SP">São Paulo</option>
                                    <option value="SE">Sergipe</option>
                                    <option value="TO">Tocantins</option>
                                </select>
                            </div>
                        </div>
                        <button type="submit" class="btn btn-primary">Enviar</button>
                    </form>
                
                    <input id="submit_form" type="submit" value="Enviar" />              
                
                </form>      
            </div>
        </div> 
        <footer id="footer" class="small-12 columns no-padding">
            <div class="global-page-container">
                <div class="small-11 small-centered large-12 columns footer-section inline">                     
                    <div class="contato small-5 medium-3 small-offset-1 medium-offset-0 columns"> 
                        <p>@2022 teste stefanini</p>
                    </div>                      
                    <hr></hr> 
                </div>
            </div>
        </footer>  
    </body>
</html>