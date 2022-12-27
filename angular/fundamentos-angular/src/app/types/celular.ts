export interface Celular {
    id: number;
    nome: string;
    descricao?: string; // A interrogação significa que a descrição do produto é opcional
    esgotado: boolean;
}