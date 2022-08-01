package br.com.stefanini.repository;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.stefanini.model.Pessoa;

@Mapper
public interface PessoaRepository extends Repository {
    @Select("SELECT * FROM TB_PESSOA")
    public List<Pessoa> buscarTodos();
    @Select("SELECT * FROM TB_PESSOA WHERE CD_PESSOA = #{cdPessoa}")
    public List<Pessoa> buscarPorCpf(@Param("cdPessoa") Integer cdPessoa);
    @Insert("INSERT INTO TB_PESSOA(CD_PESSOA,NM_PESSOA,EMAIL,DT_NASCIMENTO,NATURALIDADE,NASCIONALIDADE,NR_DOCUMENTO,SEXO,CEP,DT_CADASTRO,DT_ATUALIZACAO) VALUES (#{cdPessoa}, #{nmPessoa}, #{email}, #{dtNascimento}, #{naturalidade}, #{nacionalidade}, #{nrDocumento}, #{sexo}, #{cep}, #{dtCadastro}, #{dtAtualizacao})")
    void inserir(Pessoa pessoa);

    @Update("UPDATE TB_PESSOA SET NM_PESSOA = #{nmPessoa}, EMAIL = #{email}, DT_NASCIMENTO= #{dtNascimento}, NATURALIDADE= #{naturalidade}, NASCIONALIDADE= #{nacionalidade}, NR_DOCUMENTO= #{nrDocumento}, SEXO= #{sexo}, CEP=#{cep}, DT_ATUALIZACAO= #{dtAtualizacao} WHERE CD_PESSOA = #{cdPessoa}")
    void atualizar(Pessoa pessoa);

    @Select("SELECT * FROM TB_PESSOA WHERE CD_PESSOA = #{cdPessoa} LIMIT 1")
    public Long verificarPessoaExistente(@Param("cdPessoa") Long cdPessoa);

    @Delete("DELETE FROM TB_PESSOA WHERE CD_PESSOA =#{cdPessoa}")
    public void excluirPessoa(@Param("cdPessoa")Integer cdPessoa);


}
