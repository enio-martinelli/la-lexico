// Generated from java-escape by ANTLR 4.11.1
package br.ufscar.dc.compiladores.la.semantico;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SemanticoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SemanticoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SemanticoParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(SemanticoParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SemanticoParser#declaracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracoes(SemanticoParser.DeclaracoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SemanticoParser#declaracao_local}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_local(SemanticoParser.Declaracao_localContext ctx);
	/**
	 * Visit a parse tree produced by {@link SemanticoParser#variavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariavel(SemanticoParser.VariavelContext ctx);
	/**
	 * Visit a parse tree produced by {@link SemanticoParser#identificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificador(SemanticoParser.IdentificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SemanticoParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(SemanticoParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SemanticoParser#tipo_basico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_basico(SemanticoParser.Tipo_basicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SemanticoParser#tipo_estendido}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_estendido(SemanticoParser.Tipo_estendidoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SemanticoParser#valor_constante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor_constante(SemanticoParser.Valor_constanteContext ctx);
	/**
	 * Visit a parse tree produced by {@link SemanticoParser#registro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegistro(SemanticoParser.RegistroContext ctx);
	/**
	 * Visit a parse tree produced by {@link SemanticoParser#declaracao_global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_global(SemanticoParser.Declaracao_globalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SemanticoParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(SemanticoParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link SemanticoParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(SemanticoParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link SemanticoParser#corpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorpo(SemanticoParser.CorpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SemanticoParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(SemanticoParser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SemanticoParser#cmdLeia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdLeia(SemanticoParser.CmdLeiaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SemanticoParser#cmdEscreva}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdEscreva(SemanticoParser.CmdEscrevaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SemanticoParser#cmdSe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdSe(SemanticoParser.CmdSeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SemanticoParser#cmdCaso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdCaso(SemanticoParser.CmdCasoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SemanticoParser#cmdPara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdPara(SemanticoParser.CmdParaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SemanticoParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdEnquanto(SemanticoParser.CmdEnquantoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SemanticoParser#cmdFaca}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdFaca(SemanticoParser.CmdFacaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SemanticoParser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdAtribuicao(SemanticoParser.CmdAtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SemanticoParser#cmdChamada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdChamada(SemanticoParser.CmdChamadaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SemanticoParser#cmdRetorne}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdRetorne(SemanticoParser.CmdRetorneContext ctx);
	/**
	 * Visit a parse tree produced by {@link SemanticoParser#selecao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelecao(SemanticoParser.SelecaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SemanticoParser#item_selecao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem_selecao(SemanticoParser.Item_selecaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SemanticoParser#constantes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantes(SemanticoParser.ConstantesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SemanticoParser#numero_intervalo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero_intervalo(SemanticoParser.Numero_intervaloContext ctx);
	/**
	 * Visit a parse tree produced by {@link SemanticoParser#op_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_unario(SemanticoParser.Op_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link SemanticoParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_aritmetica(SemanticoParser.Exp_aritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SemanticoParser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo(SemanticoParser.TermoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SemanticoParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator(SemanticoParser.FatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SemanticoParser#op1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp1(SemanticoParser.Op1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SemanticoParser#op2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp2(SemanticoParser.Op2Context ctx);
	/**
	 * Visit a parse tree produced by {@link SemanticoParser#op3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp3(SemanticoParser.Op3Context ctx);
	/**
	 * Visit a parse tree produced by {@link SemanticoParser#parcela}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela(SemanticoParser.ParcelaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SemanticoParser#parcela_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_unario(SemanticoParser.Parcela_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link SemanticoParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_nao_unario(SemanticoParser.Parcela_nao_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link SemanticoParser#exp_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_relacional(SemanticoParser.Exp_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SemanticoParser#op_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_relacional(SemanticoParser.Op_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SemanticoParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(SemanticoParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SemanticoParser#termo_logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo_logico(SemanticoParser.Termo_logicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SemanticoParser#fator_logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator_logico(SemanticoParser.Fator_logicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SemanticoParser#parcela_logica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_logica(SemanticoParser.Parcela_logicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SemanticoParser#op_logico_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_logico_1(SemanticoParser.Op_logico_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SemanticoParser#op_logico_2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_logico_2(SemanticoParser.Op_logico_2Context ctx);
}